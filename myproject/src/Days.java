
public enum Days {Mon(0),Tues(1),Wed(2),Thurs(3),Fri(4),Sat(5),Sun(7);

private  int value;
private Days(int value) {
    this.value = value;
}

public int getValue() {
    return value;
}
}