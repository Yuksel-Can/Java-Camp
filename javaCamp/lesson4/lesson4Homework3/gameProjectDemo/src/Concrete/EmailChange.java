package Concrete;

import Abstracts.BaseChange;
import Entities.User;

public class EmailChange implements BaseChange{

	@Override
	public void change(User user, String value) {
		String before= user.getEMail();
		user.setEMail(value);
		System.out.println(before + ", mail'e kullanıcının maili : " + user.getEMail() + " olarak güncellendi");
	}

}
