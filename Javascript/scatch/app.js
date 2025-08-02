const express = require('express');
const app = express();

const cookieParser = require('cookie-parser');
const path = require('path');


app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(cookieParser());    
app.use(express.static(path.join(__dirname, 'public')));
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.get('/', (req, res) => {
    res.render('index', { title: 'Home Page' });
});

app.listen(3000, () => {
    console.log('Server is running on http://localhost:3000');
});