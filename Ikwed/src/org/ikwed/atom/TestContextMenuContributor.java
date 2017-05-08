package org.ikwed.atom;

import java.util.List;

import org.treez.core.Activator;
import org.treez.core.atom.base.AbstractAtom;
import org.treez.core.atom.base.ContextMenuExtender;
import org.treez.core.treeview.TreeViewerRefreshable;
import org.treez.core.treeview.action.TreeViewerAction;

public class TestContextMenuContributor implements ContextMenuExtender {

	@Override
	public List<Object> extendContextMenu(
			List<Object> existingContextMenuActions,
			AbstractAtom<?> atom,
			TreeViewerRefreshable treeViewer) {

		existingContextMenuActions.add(new TreeViewerAction(
				"Extended Action!!",
				Activator.getImage("add.png"),
				treeViewer,
				() -> System.out.println("year, extended action!!")));

		return existingContextMenuActions;
	}

	//#region ATTRIBUTES

}
