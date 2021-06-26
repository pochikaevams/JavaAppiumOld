package suites;

import lib.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticleTests.class,
        ChangeAppConditionTests.class,
        Ex5Refactored.class,
        Ex6Refactored.class,
        SearchTests.class,
        MyListTests.class
})

public class TestSuite {
}
