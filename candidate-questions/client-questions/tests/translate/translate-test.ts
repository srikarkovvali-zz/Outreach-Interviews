import {} from 'jasmine';
import { Translation } from '../../src/translate/google-translate';

//add two tests for every function. One that passes and one that fails.
//in my case there will be 4 test cases. One for the get function and one for the post function
//The first test case will check if the translation is working by checking for the source and target
//the second test case will throw an error by testing for the wrong language.

//POST
//for the post function again, the two above tests will be replicated
describe('translation_tests', () => {

    //These are the tests for the get function
  it('empty_obj_test', async () => {
      const result = await Translation.translateget({
        source: undefined,
        target: undefined
      });

      expect(result[0]).toBeUndefined();
  });
  it('correct_language_test', async ()=>{
     const result = await Translation.translateget({
          source: 'Où sont les toilettes?',
          target: 'br'
      });
      expect(result).toBe('fr');
  });

  //These are the tests for the post function


});
