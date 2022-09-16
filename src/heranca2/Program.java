package heranca2;

import heranca2.entities.Account;
import heranca2.entities.BusinessAccount;
import heranca2.entities.SavingAccount;

import java.util.AbstractCollection;

public class Program {
        public static void main(String[] args){

            Account acc = new Account(12131, "ROSENDO", 1200.0);

            BusinessAccount bacc = new BusinessAccount(123131, "Silva", 1300.0, 1300.0);

            //UpCasting
            Account acc1 = bacc;
            Account acc2 = new BusinessAccount(1231, "ewerton", 1500.0, 1500.0 );
            Account acc3 = new SavingAccount(4382, "ewerton rosendo da silva", 2000.0,
                                0.3);


            //DownCasting

            BusinessAccount acc4 = (BusinessAccount) acc2;
        }

}
