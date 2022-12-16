package in.phonebook.binding;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	private String contactName;
    private String contactEmail;
    private Long contactNumber;
    private String activeStatus;
}
