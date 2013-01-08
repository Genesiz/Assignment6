package spreadsheet.logical;

import spreadsheet.expression.NullaryExpression;

public final class False
    extends NullaryExpression {

  public False() {
    super(LogicalType.instance);
  }

  @Override
  public boolean toBoolean() {
    return false;
  }

  public String getDescription() {
    return String.format("%s",
      this.getClass().getSimpleName()
    );
  }

}
