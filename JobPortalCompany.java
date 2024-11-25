
public class JobPortalCompany {
	String name;
	int requiredCandidates;
	JobPortalCompany(String a,int b){
		this.name=a;
		this.requiredCandidates=b;
		
	}
}

class JobPortal{
	public String applyJob(JobPortalCompany JobData,String CompanyName,int num) {
		if(!CompanyName.equals(JobData.name)) {
			try {throw new CompanyNotFoundException("no such company found");
		}
		catch(Exception e) {
			return " "+e;
		}
	}
		else if(JobData.requiredCandidates<num) {
			try {throw new NoVacancyFoundException("No Vacancy available");
			}
		catch(Exception e) {
			return " "+e;
		
	}
}
		JobData.requiredCandidates=num;
		return "applied Successfully";  
}
}

class CompanyNotFoundException extends Exception{
	public CompanyNotFoundException(String a) {
		super(a);
	}

class NoVacancyFoundException extends Exception{
	public NoVacancyFoundException(String a) {
		super(a);
	}
}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*class JobPortalCompany {
    String name;
    int requiredCandidates;

    JobPortalCompany(String a, int b) {
        this.name = a;
        this.requiredCandidates = b;
    }
}

class JobPortal {
    public String applyJob(JobPortalCompany JobData, String CompanyName, int num) {
        // Check if the company name matches
        if (!CompanyName.equals(JobData.name)) {
            try {
                throw new CompanyNotFoundException("No such company found");
            } catch (Exception e) {
                return e.getMessage();  // Return the exception message
            }
        }
        // Check if there are enough vacancies for the given number of candidates
        else if (JobData.requiredCandidates < num) {
            try {
                throw new NoVacancyFoundException("No Vacancy available");
            } catch (Exception e) {
                return e.getMessage();  // Return the exception message
            }
        }

        // Update the number of candidates required
        JobData.requiredCandidates -= num;  // Decrease the number of available candidates
        return "Applied Successfully";  // Success message
    }
}

class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(String a) {
        super(a);
    }
}

class NoVacancyFoundException extends Exception {
    public NoVacancyFoundException(String a) {
        super(a);
    }
}

public class Main {
    public static void main(String[] args) {
        // Test code to check functionality
        JobPortalCompany company = new JobPortalCompany("TechCorp", 5);
        JobPortal portal = new JobPortal();

        // Test case where company name matches
        System.out.println(portal.applyJob(company, "TechCorp", 3)); // Applied successfully
        System.out.println("Remaining vacancies: " + company.requiredCandidates);

        // Test case where company name does not match
        System.out.println(portal.applyJob(company, "OtherCorp", 2)); // No such company found

        // Test case where there are not enough vacancies
        System.out.println(portal.applyJob(company, "TechCorp", 10)); // No Vacancy available
    }
}
*/
