import express from "express";

import * as db from './src/config/db/initialData';

const app = express();
const env = process.env;
const PORT = env.PORT || 8080;

db.createIniitialData();

api.get('api/status', (req, res) => {
    return res.status(200).json({
        service: 'Auth-api',
        status: 'up',
        httpStatus: 200
    })
})

app.listen(PORT, () => {
    console.log(`Server started successfully at port ${PORT}`);
})