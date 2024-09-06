package assignments.week3.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {

	public static void main(String[] args) {

		String companies[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Add the collection to a list
		List<String> companyList = new ArrayList<>();
		Collections.addAll(companyList, companies);
		companyList.sort(null);
		System.out.println("Companies list before sorting >>>>" + companyList);

		// Expected output: Wipro, HCL, CTS, Aspire Systems. So reversing the collection

		Collections.reverse(companyList);

		System.out.println("Companies list after reversing >>>" + companyList);

	}

}
