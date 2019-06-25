import express from 'express';
import {IPostTranslate, ITranslate, Translation} from './translate/google-translate';
const app = express();
const port = 8080; // default port to listen

// define a route handler for the default home page
app.get( '/', async ( resp: any, res: any ) => {
    const translateInterface: ITranslate = {
        source: 'Where is my food?',
        target: 'fr'
    };
    const response: [string, any] = await Translation.translateget(translateInterface);
    res.send( response[0] );

} );

app.post( '/convert', async ( resp: any, res: any ) => {
    const postcheckInterface: IPostTranslate = {
        convert: ['This is the post message',
        'This is the second post message',
        'This is the third post message'],
        language: 'fr'
    };
    //const response: string[] = await Translation.translatepost(postcheckInterface);
    //res.send( response[0] );
} );

// start the Express server
app.listen( port, () => {
    // tslint:disable-next-line:no-console
    console.log( `server started at http://localhost:${ port }` );
} );
