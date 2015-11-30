package com.mbrlabs.mundus.ui.components.menu;

import com.kotcrab.vis.ui.widget.MenuBar;

/**
 * @author Marcus Brummer
 * @version 22-11-2015
 */
public class MundusMenuBar extends MenuBar {

    private FileMenu fileMenu;
    private EditMenu editMenu;
    private WindowMenu windowMenu;
    private TerrainMenu terrainMenu;

    public MundusMenuBar() {
        super();
        fileMenu = new FileMenu();
        editMenu = new EditMenu();
        terrainMenu = new TerrainMenu();
        windowMenu = new WindowMenu();
        addMenu(fileMenu);
        addMenu(editMenu);
        addMenu(terrainMenu);
        addMenu(windowMenu);
    }

    public FileMenu getFileMenu() {
        return fileMenu;
    }

    public EditMenu getEditMenu() {
        return editMenu;
    }

    public WindowMenu getWindowMenu() {
        return windowMenu;
    }

    public TerrainMenu getTerrainMenu() {
        return terrainMenu;
    }

}
