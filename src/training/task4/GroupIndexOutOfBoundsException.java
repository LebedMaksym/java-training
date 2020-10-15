package training.task4;

public class GroupIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException {

  public GroupIndexOutOfBoundsException() {
    super();
  }

  public GroupIndexOutOfBoundsException(String s) {
    super(s);
  }

  public GroupIndexOutOfBoundsException(int index) {
    super(index);
  }

  @Override
  public String getMessage() {
    return "The index is out of the group range; " + super.getMessage();
  }
}
