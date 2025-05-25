public class Main {

    public static void main(String[] args) {
	//Line 1
        //Line 2
        //Line 3
		// aded by thejani
        //Line 4
        //Line 5
		
		
		
		///testtttttttttttttttttttttttttttttttttttt
        ApplicationGraph applicationGraph = DaggerApplicationGraph.create();
                UserRepository userRepository1 = applicationGraph.userRepository();
                UserRepository userRepository2 = applicationGraph.userRepository();

                System.out.println(userRepository1);
                System.out.println(userRepository2);

                PreferenceManager preferenceManager1 = applicationGraph.preferenceManager();
                PreferenceManager preferenceManager2 = applicationGraph.preferenceManager();

                System.out.println(preferenceManager1);
                System.out.println(preferenceManager2);
	
// modified at 7.58 pm
    }

}
