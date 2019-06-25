import { Translate } from '@google-cloud/translate';
import * as dotenv from 'dotenv';

export interface ITranslate {
    source: string;
    target: string;
}

export interface IPostTranslate {
    convert: string[];
    language: string;
}

/**
 * Class used as a helper to perform translations
 */
export class Translation {
    /**
     * Function used to perform a translation
     * @param input ITranslate interface used to perform a translation
     */
    /*
    public static async translatepost(input: IPostTranslate): Promise<[Array<string>, any]> {
        if (input &&
            input.convert && input.language) {
            // Read in the .env file and process the variables
            dotenv.config();

            const apiKey = `${process.env.TRANSLATE_API}`;

            if (!apiKey) {
                throw Error('No configured API key');
            }

            const translateObj = new Translate({
                key: apiKey
            });
            // The text to translate
            const texts: string[] = input.convert;
            // The target language
            const target = input.language;
            let newarray: Array<string> =[];
            for (const item of texts) {
                newarray.push(translateObj.translate(texts[item],target));
            }
            return await newarray[];
        }
        return [undefined, {}];
    }
    */
    public static async translateget(input: ITranslate): Promise<[string, any]> {
        if (input && input.source && input.target) {
            // Read in the .env file and process the variables
            dotenv.config();

            const apiKey = `${process.env.TRANSLATE_API}`;

            if (!apiKey) {
                throw Error('No configured API key');
            }

            const translateObj = new Translate({
                key: apiKey
            });
            // The text to translate

            const text = input.source;
            // The target language
            const target = input.target;
            return await translateObj.translate(text, target);
        }
        return [undefined, {}];
    }
}
