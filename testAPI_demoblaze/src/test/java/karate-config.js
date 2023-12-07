function fn(){
    karate.configure('connectTimeout', 5000)
    karate.configure('readTimeout', 5000)

    const number = Math.floor(Math.random() * 1000) + 1;
    const user_aut = `Test_demo_${number}`;

    return {
        api: {
            baseurl: "https://api.demoblaze.com/"
        },
        user:{
            name: user_aut
        }
    }
}