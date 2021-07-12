package org.eclipse.poosl.rotalumisclient.perspectives;

import org.eclipse.poosl.rotalumisclient.PooslConstants;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class PooslDebugPerspective implements IPerspectiveFactory {
    private static final String TOP_LITERAL = "top";

    private IPageLayout factory;

    @Override
    public void createInitialLayout(IPageLayout pFactory) {
        this.factory = pFactory;
        addViews();
        addActionSets();
        addNewWizardShortcuts();
        addPerspectiveShortcuts();
        addViewShortcuts();
    }

    private void addViews() {
        // Creates the overall folder layout.
        // Note that each new Folder uses a percentage of the remaining
        // EditorArea.
        factory.createFolder(TOP_LITERAL, IPageLayout.TOP, 0.4f, factory.getEditorArea());
        IFolderLayout insideTop = factory.createFolder("insideTop", // NON-NLS-1
                IPageLayout.LEFT, 0.33f, TOP_LITERAL);
        insideTop.addView(PooslConstants.ID_POOSL_DEBUGVIEW); // NON-NLS-1
        IFolderLayout insideTop1 = factory.createFolder("insideTop1", // NON-NLS-1
                IPageLayout.LEFT, 0.5f, TOP_LITERAL);

        insideTop1.addView(PooslConstants.ID_POOSL_PETVIEW); // NON-NLS-1
        IFolderLayout insideTop2 = factory.createFolder("insideTop2", // NON-NLS-1
                IPageLayout.LEFT, 0.05f, TOP_LITERAL);
        insideTop2.addView(PooslConstants.ID_POOSL_VARIABLESVIEW); // NON-NLS-1
        IFolderLayout right = factory.createFolder("right", // NON-NLS-1
                IPageLayout.RIGHT, 0.5f, factory.getEditorArea());
        right.addView(PooslConstants.ID_POOSL_SEQUENCEDIAGRAMVIEW);
        right.addView(IPageLayout.ID_OUTLINE);
        IFolderLayout bottom = factory.createFolder("bottom", // NON-NLS-1
                IPageLayout.BOTTOM, 0.7f, factory.getEditorArea());
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView("org.eclipse.debug.ui.BreakpointView");
        bottom.addView("org.eclipse.ui.views.PropertySheet");
        bottom.addView("org.eclipse.ui.views.TaskList");
    }

    private void addActionSets() {
        factory.addActionSet("org.eclipse.debug.ui.debugActionSet"); // NON-NLS-1
        factory.addActionSet("org.eclipse.poosl.rotalumisclient.debugactionset"); // NON-NLS-1
        factory.addActionSet("org.eclipse.debug.ui.launchActionSet"); // NON-NLS-1
        factory.addActionSet("org.eclipse.debug.ui.breakpointActionSet"); // NON-NLS-1
        factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);
    }

    private void addPerspectiveShortcuts() {
        factory.addPerspectiveShortcut(PooslConstants.ID_POOSL_EDIT_PERSPECTIVE);
    }

    private void addNewWizardShortcuts() {
        factory.addNewWizardShortcut("org.eclipse.poosl.pooslproject.projectwizard"); // NON-NLS-1
        factory.addNewWizardShortcut("org.eclipse.poosl.pooslproject.filewizard"); // NON-NLS-1
        factory.addNewWizardShortcut("org.eclipse.poosl.pooslproject.filewithsystemwizard"); // NON-NLS-1
    }

    private void addViewShortcuts() {
        factory.addShowViewShortcut(PooslConstants.ID_POOSL_DEBUGVIEW);
        factory.addShowViewShortcut(PooslConstants.ID_POOSL_PETVIEW);
        factory.addShowViewShortcut(PooslConstants.ID_POOSL_VARIABLESVIEW);
        factory.addShowViewShortcut(PooslConstants.ID_POOSL_SEQUENCEDIAGRAMVIEW);
        factory.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        factory.addShowViewShortcut(IPageLayout.ID_OUTLINE);
    }
}