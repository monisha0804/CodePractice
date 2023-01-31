package example.SampleProgram.Countires;

import java.util.HashMap;
import java.util.Map;

public class CAC {
	 private Map<String,String> cac =new HashMap<String,String>();

	    public Map<String, String> getCac() {
	        return cac;
	    }

	    public void setCac(Map<String, String> cac) {
	        this.cac = cac;
	    }
	    
	    private String cname;
	    private String capname;

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getCapname() {
			return capname;
		}

		public void setCapname(String capname) {
			this.capname = capname;
		}

		public CAC(Map<String, String> cac, String cname, String capname) {
			super();
			this.cac = cac;
			this.cname = cname;
			this.capname = capname;
		}

		public CAC() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void add(String cname2, String capname2) {
			// TODO Auto-generated method stub
			cac.put(cname2, capname2);
		}

		
}
