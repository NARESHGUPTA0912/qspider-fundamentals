
const users = [ "Tinku", "Dinga"];

try{
    console.log("Start of try block");
    
    if(users.length === 0)
    {
         throw new Error("Something went wrong!");
    }

   console.log("End of try block");
}
catch(err)
{
    console.log("Error Name:",err.name);
    console.log("Error Message:",err.message);
}
finally{
    console.log("Promgram End");
}