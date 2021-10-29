package Enumeration;

public class Enumcls4 {
	
	 private ClassA status;
	    public enum ClassA {
	        ORDERED (5){
	           
	            public boolean isOrdered() {
	                return true;
	            }
	        },
	        READY (2){
	        
	            public boolean isReady() {
	                return true;
	            }
	        },
	        DELIVERED (0){
	            
	            public boolean isDelivered() {
	                return true;
	            }
	        };

	        private int timeToDelivery;

	        public boolean isOrdered() {return false;}

	        public boolean isReady() {return false;}

	        public boolean isDelivered(){return false;}

	        public int getTimeToDelivery() {
	            return timeToDelivery;
	        }

	        ClassA (int timeToDelivery) {
	            this.timeToDelivery = timeToDelivery;
	        }
	    }

	    public boolean isDeliverable() {
	        return this.status.isReady();
	    }

	    public void printTimeToDeliver() {
	        System.out.println("Time to delivery is " + 
	          this.getStatus().getTimeToDelivery());
	    }
	    
	    private ClassA getStatus() {
			// TODO Auto-generated method stub
			return null;
		}

		// Methods that set and get the status variable.
	
public static void main(String[] args) {
	
}
}
