// fetch data from public api from public api

const express = require('express');
const axios = require('axios');
const app = express();
const PORT = 3000;

app.get('/api/data', async (req,res)=>{
    try{
        const response = await axios.get('https://jsonplaceholder.typicode.com/posts');
        res.json(response.data);
    }catch(error){
        console.error('Error fetching data',error);
        res.status(500).json({error:'Failed to fetch data'});
    }
})

app.listen(PORT,()=>{
    console.log(`Server is running on PORT ${PORT}`);
})