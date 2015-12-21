/* 
 * Copyright (c) 2015 Sebastian Brudzinski
 * 
 * See the file LICENSE for copying permission.
 */
package latexstudio.editor.toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import latexstudio.editor.EditorTopComponent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Edit",
        id = "latexstudio.editor.WrapLines"
)
@ActionRegistration(
        displayName = "#CTL_WrapLines"
)
@ActionReference(path = "Menu/Edit", position = 0)
@Messages("CTL_WrapLines=Wrap Lines")
public final class WrapLines implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ev) {
        TopComponent tc = WindowManager.getDefault().findTopComponent("EditorTopComponent");
        EditorTopComponent etc = (EditorTopComponent) tc;
        etc.wrapLines();
    }
}
