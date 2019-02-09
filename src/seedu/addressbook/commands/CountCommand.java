package seedu.addressbook.commands;

//import seedu.addressbook.data.AddressBook;

public class CountCommand extends Command {

    public static final String COMMAND_WORD = "count";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds number of persons in the address book\n"
            + "Example: " + COMMAND_WORD;

    private final int count;

    public CountCommand{
        this.count = -1;
    }

    public int getNumPersonInBook(){
        this.count = addressBook.getAllPersons().size();
        return this.count;
    }


    @Override
    public CommandResult execute() {
        return new CommandResult(getMessageForPersonCount(getNumPersonInBook()));
    }

}
