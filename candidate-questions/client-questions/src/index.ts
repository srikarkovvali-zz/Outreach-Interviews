import express from 'express';
import {ITranslate, Translation} from './translate/google-translate';
const app = express();
const port = 8080; // default port to listen

// define a route handler for the default home page
app.get( '/', async ( resp: any, res: any ) => {
    const translateInterface: ITranslate = {
        source: 'Where are the bathrooms?',
        target: 'fr'
    };
    const response: [string, any] = await Translation.translate(translateInterface);
    res.send( response[0] );
} );

// start the Express server
app.listen( port, () => {
    // tslint:disable-next-line:no-console
    console.log( `server started at http://localhost:${ port }` );
} );
