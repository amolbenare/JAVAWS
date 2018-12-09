import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//Employee POJO Class
class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccopation() {
        return occopation;
    }

    public void setOccopation(String occopation) {
        this.occopation = occopation;
    }

    String name;
    String city;

    public Employee(String name, String city, String occopation) {
        this.name = name;
        this.city = city;
        this.occopation = occopation;
    }

    String occopation;
}

//Tree Data Structure
class TreeDataStructure {

    HashMap<String, HashMap<String, ArrayList<String>>> mapRoot;
    TreeDataStructure(){
        mapRoot = new HashMap<>();
    }

    public void addNode(Employee emp){
        if(mapRoot.containsKey(emp.getCity())){
            HashMap<String, ArrayList<String>> occup = mapRoot.get(emp.getCity());
            if(occup.containsKey(emp.getOccopation())){
                ArrayList<String> employee = occup.get(emp.getOccopation());
                employee.add(emp.getName());
            } else {
                ArrayList<String> employee = new ArrayList<>();
                employee.add(emp.getName());
                occup.put(emp.getOccopation(), employee);
            }
        }else {
            ArrayList<String> employee = new ArrayList<>();
            employee.add(emp.getName());
            HashMap<String, ArrayList<String>> occup = new HashMap<>();
            occup.put(emp.getOccopation(), employee);
            mapRoot.put(emp.getCity(),occup);
        }
    }

    /*public StringBuffer getAllNodes(){
        StringBuffer bufferTemp = new StringBuffer();
        for (Map.Entry<String, HashMap<String, ArrayList<String>>> entryCity:
                mapRoot.entrySet()) {
            bufferTemp.append("\n"+entryCity.getKey());
            HashMap<String, ArrayList<String>> occup = entryCity.getValue();
            for (Map.Entry<String, ArrayList<String>> employee:
                    occup.entrySet()) {
                bufferTemp.append("\n"+"\t-"+employee.getKey());
                for (String name: employee.getValue()) {
                    bufferTemp.append("\n"+"\t\t-"+name);
                }
            }

        }

        return bufferTemp;
    }*/

    public void printAllNodes(){
        if(mapRoot.size()>0){
            String city = mapRoot.entrySet().iterator().next().getKey();
            System.out.println(city);
            printOccupation(mapRoot.get(city));
            mapRoot.remove(city);
            printAllNodes();

        }
    }

    private void printOccupation(HashMap<String, ArrayList<String>> mapOcc){
        if(mapOcc.size()>0) {
            String occupation = mapOcc.entrySet().iterator().next().getKey();
            System.out.println("\t-" + occupation);
            printCity(mapOcc.get(occupation));
            mapOcc.remove(occupation);
            printOccupation(mapOcc);
        }
    }

    private void printCity(ArrayList<String> names){
        if(names.size()>0){
            String name = names.iterator().next();
            names.remove(name);
            System.out.println("\t\t-" + name);
            printCity(names);
        }
    }
}


class TreeDataSetDemo{

	public static void main(String[] args) {
		
		//Initialise data structure
		TreeDataStructure empData = new TreeDataStructure();

		//Creating data objects
        Employee emp1 = new Employee("Raj", "San Francisco", "Software Engineer");
        Employee emp2 = new Employee("John", "New York", "Businessman");
        Employee emp3 = new Employee("Adam", "New York", "Software Engineer");
        Employee emp4 = new Employee("Lee", "San Francisco", "Businessman");
        Employee emp5 = new Employee("Alice", "New York", "Software Engineer");
        Employee emp6 = new Employee("Mohammad", "San Francisco", "Software Engineer");
        Employee emp7 = new Employee("Monica", "New York", "Businessman");
        Employee emp8 = new Employee("Rachel", "San Francisco", "Businessman");
        Employee emp9 = new Employee("Amol", "San Francisco", "Software Engineer");

        //Adding data in dataset
        empData.addNode(emp1);
        empData.addNode(emp2);
        empData.addNode(emp3);
        empData.addNode(emp4);
        empData.addNode(emp5);
        empData.addNode(emp6);
        empData.addNode(emp7);
        empData.addNode(emp8);
        empData.addNode(emp9);

        //Printing data
        //StringBuffer buffAllData = empData.getAllNodes();
        //System.out.println(buffAllData.toString());

        //Printing data with new method (With Recursive function. Avoided for loops)

        empData.printAllNodes();
	}


}