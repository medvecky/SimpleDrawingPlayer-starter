package ui.tools;

import model.Rectangle;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class RectagngleTool extends ShapeTool {

    public RectagngleTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    //EFFECTS: Returns the string for the label.
    @Override
    String getLabel() {
        return "Rectangle";
    }

    //EFFECTS: Constructs and returns the new rectangle
    @Override
    void makeShape(MouseEvent e) {
        shape = new Rectangle(e.getPoint(), editor.getMidiSynth());
    }
}
