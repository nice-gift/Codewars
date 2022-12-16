package convertStringToCamelCaseTest;

import convertStringToCamelCase.Solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_" +
                "existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_" +
                "all_of_the_other_related_fields";
        System.out.println("input: "+input);
        assertEquals("YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedThe" +
                "ExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields",
                Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart2() {
        String input = "tHe-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}
