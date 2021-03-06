package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gui.language.Language;

import gui.control.ExitListener;
import gui.control.NewSpreadsheetListener;

public final class MenuBar
    extends JMenuBar {

  public static final long serialVersionUID = 1L;

  public static final MenuBar instance = new MenuBar();

  private MenuBar() {
    super();
    this.add(this.newFileMenu());
    this.add(this.newSpreadsheetMenu());

  }

  private JMenu newFileMenu() {
    final JMenu menu = new JMenu(Language.instance.file());
    menu.add(this.newExitMenuItem());
    return menu;
  }
  
  private JMenu newSpreadsheetMenu() {
	    final JMenu menu = new JMenu(Language.instance.regneark());
	    menu.add(this.newSpreadsheetMenuItem());
	    return menu;
	  }

  
  private JMenuItem newSpreadsheetMenuItem() {
	  final JMenuItem menuItem = new JMenuItem(Language.instance.newspreadsheet());
	  menuItem.addActionListener(NewSpreadsheetListener.instance);
	  return menuItem;
  }

private JMenuItem newExitMenuItem() {
    final JMenuItem menuItem = new JMenuItem(Language.instance.exit());
    menuItem.addActionListener(ExitListener.instance);
    return menuItem;
  }

}
