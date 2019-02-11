package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.util.TestUtil;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountCommandTest {
    @Test
    public void testCount() throws Exception {
        AddressBook addressBook;
        List<ReadOnlyPerson> EMPTY_LIST_PLACEHOLDER = Collections.emptyList();

        // Create Persons
        Person a = new Person(new Name("A"), new Phone("123", false),
                new Email("A@gmail.com", false), new Address("asd", false), Collections.EMPTY_SET);
        Person b = new Person(new Name("B"), new Phone("456", false),
                new Email("B@gmail.com", false), new Address("asd", false), Collections.EMPTY_SET);
        Person c = new Person(new Name("C"), new Phone("789", false),
                new Email("C@gmail.com", false), new Address("asd", false), Collections.EMPTY_SET);
        Person d = new Person(new Name("D"), new Phone("321", false),
                new Email("D@gmail.com", false), new Address("asd", false), Collections.EMPTY_SET);

        // Test Case 1 : 0 persons
        addressBook = TestUtil.createAddressBook(a,b);
        String expectedMessage = String.format(Messages.MESSAGE_PERSONS_COUNT, 0);

        CountCommand countCmd = new CountCommand();
        countCmd.setData(addressBook, EMPTY_LIST_PLACEHOLDER);
        CommandResult result = countCmd.execute();
        System.out.println(result.feedbackToUser);
        assertEquals(expectedMessage, result.feedbackToUser);
    }
}
