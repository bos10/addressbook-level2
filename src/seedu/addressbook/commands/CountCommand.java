package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

public class CountCommand extends Command {

    public static final String COMMAND_WORD = "count";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds number of persons in the address book\n"
            + "Example: " + COMMAND_WORD;

    private int count =0;

    public int getCount(){
        return this.count;
    }
    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();  // get arraylist of all persons
        this.count =  allPersons.size();
        return new CommandResult(getMessageForPersonCount(getCount()));
    }

}
