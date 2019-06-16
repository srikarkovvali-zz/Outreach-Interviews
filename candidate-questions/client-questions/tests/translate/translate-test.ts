import {} from 'jasmine';
import { Translation } from '../../src/translate/google-translate';

describe('translation_tests', () => {
  it('empty_obj_test', async () => {
      const result = await Translation.translate({
        source: undefined,
        target: undefined
      });

      expect(result[0]).toBeUndefined();
  });
});
