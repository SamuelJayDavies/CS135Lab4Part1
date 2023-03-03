import static org.junit.Assert.*;

import org.junit.Test;

public class TestingWithArrays {

	public SingleTest[]  myTestSuite () {
		SingleTest[] tmp = new SingleTest [6];
		tmp[0] = new SingleTest(1, 2, 3,TriangleClassifier.TriangleType.NOT_A_TRIANGLE);
    	tmp[1] = new SingleTest(1, 2, 3,TriangleClassifier.TriangleType.NOT_A_TRIANGLE);
		tmp[2] = new SingleTest(5, 5, 5,TriangleClassifier.TriangleType.EQUILATERAL);
		tmp[3] = new SingleTest(2, 2, 3,TriangleClassifier.TriangleType.ISOSCELES);
		tmp[4] = new SingleTest(3, 4, 5,TriangleClassifier.TriangleType.SCALENE);
		tmp[5] = new SingleTest(4, 1, 53,TriangleClassifier.TriangleType.NOT_A_TRIANGLE);
        return tmp;    	
	}
	                                     	
	@Test  
    public void ExecuteTestSuite () {
       SingleTest[] TestSuite;
       TestSuite = myTestSuite();
       for (int i = 0; i < TestSuite.length; i++) {
    	    assertEquals(  TestSuite[i].Output(),
					TriangleClassifier.classify( TestSuite[i].FirstInput(),
	    		                            TestSuite[i].SecondInput(),
	                                        TestSuite[i].ThirdInput()
	                                       )  
    	              );	
    	}	
    }

	/**
	 * Pros
	 *  - Less code to write
	 *  - Faster and easier to code
	 *
	 *  Cons
	 *  - Harder to pinpoint which test failed
	 *  - Can only see the overall result and not the state of individual tests
	 */
    
}



