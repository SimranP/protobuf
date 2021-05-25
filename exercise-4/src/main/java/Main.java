import com.github.simranp.protos.AddressBook;
import com.github.simranp.protos.Person;
import com.github.simranp.protos.Person.PhoneNumber;
import com.github.simranp.protos.Person.PhoneType;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
  public static void main(String[] args) {
    AddressBook addressBook = AddressBook.newBuilder()
      .addPeople(newPerson(1, "chiknichameli@akeli.com", asList(newPhone("1234567890", PhoneType.HOME), newPhone("0765432112", PhoneType.MOBILE))))
      .addPeople(newPerson(2, "stuck.rajia@gunde.com", asList(newPhone("1234567890", PhoneType.HOME), newPhone("0765432112", PhoneType.MOBILE))))
      .build();

    System.out.println(addressBook);
  }

  private static Person newPerson(int id, String email, List<PhoneNumber> phoneNumbers) {
    return Person.newBuilder()
      .setId(id)
      .setEmail(email)
      .addAllPhones(phoneNumbers)
      .build();
  }

  private static PhoneNumber newPhone(String value, PhoneType phoneType) {
    return PhoneNumber.newBuilder()
      .setNumber(value)
      .setType(phoneType)
      .build();
  }
}
