package org.yesworkflow.annotations;

import org.yesworkflow.YesWorkflowTestCase;
import org.yesworkflow.annotations.Param;
import org.yesworkflow.extract.CommentLine;

public class TestParam extends YesWorkflowTestCase {

    private static final CommentLine line = new CommentLine(1L, 1L, 1L, "");

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testParam_VariableOnly() throws Exception {
        Param param = new Param(1L, line, "@param x");
        assertEquals("x", param.name);
        assertEquals("x", param.binding());
        assertNull(param.description);
    }
    
    public void testParamComment_LiteralNumberOnly() throws Exception {
        Param param = new Param(1L, line, "@param 30.7");
        assertEquals("30.7", param.name);
        assertEquals("30.7", param.binding());
        assertNull(param.description);
    }

    public void testParamComment_LiteralStringOnly() throws Exception {
        Param param = new Param(1L, line, "@param \"datafile.csv\"");
        assertEquals("\"datafile.csv\"", param.name);
        assertEquals("\"datafile.csv\"", param.binding());
        assertNull(param.description);
    }
    
    public void testParamComment_VariableAndDescription() throws Exception {
        Param param = new Param(1L, line, "@param x The longitude");
        assertEquals("x", param.name);
        assertEquals("x", param.binding());
        assertEquals("The longitude", param.description);
    }
    
    public void testParamComment_VariableAndLabel() throws Exception {
        Param param = (Param) new Param(1L, line, "@param x ");
        new As(2L, line, "@as longitude", param);
        assertEquals("x", param.name);
        assertEquals("longitude", param.binding());
        assertNull(param.description);
    }

    public void testParamComment_VariableAndLabel_ExtraSpaces() throws Exception {
        Param param = (Param) new Param(1L, line, "@param x  ");
        new As(2L, line, "  @as  longitude", param);
        assertEquals("x", param.name);
        assertEquals("longitude", param.binding());
        assertNull(param.description);
    }

    public void testParamComment_VariableLabelDescription_DescriptionOnName() throws Exception {
        Param param  = (Param) new Param(1L, line, "@param x    Half of the coordinates ");
        new As(2L, line, " @as  longitude", param);
        assertEquals("x", param.name);
        assertEquals("longitude", param.binding());
        assertEquals("Half of the coordinates", param.description);
    }

    public void testParamComment_VariableLabelDescription_DescriptionOnAlias() throws Exception {
        Param param = (Param) new Param(1L, line, "@param x   ");
        new As(2L, line, " @as  longitude  Half of the coordinates", param);
        assertEquals("x", param.name);
        assertEquals("longitude", param.binding());
        assertEquals("Half of the coordinates", param.description);
    }

    public void testParamComment_VariableLabelDescription_DescriptionOnNameAndAlias() throws Exception {
        Param param = (Param) new Param(1L, line, "@param x Half of   ");
        new As(2L, line, " @as  longitude   the coordinates", param);
        assertEquals("x", param.name);
        assertEquals("longitude", param.binding());
        assertEquals("Half of the coordinates", param.description);
    }
    
}
