const { MongoClient } = require("mongodb");
const MongoDB_URI = "mongodb://localhost:27017";

// const Restaurant = require('restaurant');

const database = 'Restaurant';

const collectionName = 'data';

async function DatabaseConnection(){
    const client = new MongoClient(MongoDB_URI);
    try{
        await client.connect();
        const db = client.db(database);
        console.log('Database Connected Successfully');
    }catch(error){
        console.log(error);
    }
}

// Basic Aggregations:
// Count the total number of restaurants in the dataset.
// Find the number of restaurants for each borough.
// Find the number of restaurants for each cuisine type.
// Find the average, minimum, and maximum score of all restaurants.
// Filtering and Grouping:
// List the top 5 cuisines with the most restaurants.
// Find the top 3 boroughs with the highest number of restaurants.
// Find the average score of restaurants in each borough.
// Find the number of restaurants in each borough with a grade of "A".
// Sorting and Limiting:
// List the top 10 highest-rated restaurants based on their latest score.
// Find the 5 restaurants with the lowest score.
// Nested Document Aggregation:
// Find the restaurant with the highest overall score based on all past grades.
// Find the average score of restaurants for each cuisine type.
// Count the number of restaurants that have received a "C" grade at least once.
// Find the number of restaurants that have improved from a "B" to an "A" in their latest two grades.
// Geo Queries:
// Find the restaurant closest to a given coordinate [-73.856077, 40.848447].
// Find the number of restaurants within a 2 km radius of a given coordinate.
// Advanced Aggregations:
// Find the percentage of restaurants in each borough that have received an "A" grade.
// List restaurants where the latest grade is worse than the previous grade.
// Find the restaurants that have had a "B" or worse in the past but improved to an "A" in the latest grading.
// Find the cuisine type with the highest average score


async function PracticBasicQueris() {
    const client = new MongoClient(MongoDB_URI);
    try{
        await client.connect();
        const db = client.db(database);

        // Pratice Question 1:  Write a MongoDB query to display all the documents in the collection restaurants.
   
        const collection = db.collection(collectionName);
        const result = await collection.find({}).toArray();
        // console.log('Pratice Question 1:',result.length);

        // Write a MongoDB query to display the fields restaurant_id, name, borough and 
        // cuisine for all the documents in the collection restaurant.
        const query2 = await collection.find({},{"restaurant_id":1,"name":1,"borough":1,"cuisine":1});
        console.log('Practice Question 2',query2.length);
    }catch(error){
        console.log(error);
    }
}

 DatabaseConnection();
 PracticBasicQueris();
