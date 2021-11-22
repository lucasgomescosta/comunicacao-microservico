import express from "express";

import * as db from './src/config/db/initialData.js';
import userRoutes from './src/modules/user/routes/UserRoutes.js'

const app = express();
const env = process.env;
const PORT = env.PORT || 8080;

db.createIniitialData();

app.use(express.json());

api.get('api/status', (req, res) => {
    return res.status(200).json({
        service: 'Auth-api',
        status: 'up',
        httpStatus: 200
    })
})

app.use(userRoutes);

app.listen(PORT, () => {
    console.log(`Server started successfully at port ${PORT}`);
})