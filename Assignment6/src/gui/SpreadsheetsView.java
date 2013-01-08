package gui;

import javax.swing.JLabel;

public final class SpreadsheetsView
    extends JLabel {

  public static final long serialVersionUID = 1L;

  public static final SpreadsheetsView instance = new SpreadsheetsView();

  private SpreadsheetsView() {
    super("SpreadsheetsView");
  }

}
