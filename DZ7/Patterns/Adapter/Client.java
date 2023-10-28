package DZ7.Patterns.Adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

  public int getCallsCount(Date from, Date to) {
    return 0;
  }

  public List<Calling> getCalls(Date from, Date to) {
    return new ArrayList<Calling>();
  }
}