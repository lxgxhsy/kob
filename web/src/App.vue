<template>

<NavBar/>

  <router-view></router-view>
</template>


<script>
import NavBar from '@/components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'

export default{
  components:{
    NavBar
  },
  setup() {
  $.ajax({
    url:"http://127.0.0.1:3008/user/account/token/",
    type:"post",
    data:{
      nickname:'sy',
      password:'ssy',
    },
    header: { 
    "Content-Type": "application/x-www-form-urlencoded" //POST方式
    },
   success(resp){
    console.log(resp);
   },

   error(resp){
    console.log(resp);
   }
  });


  $.ajax({
    url:"http://localhost:3008/user/account/info/",
    type:"get",
    headers:{
    Authorization: "Bearer " + ""
    },
   success(resp){
    console.log(resp);
   },

   error(resp){
    console.log(resp);
   }

  });
 
  $.ajax({
    url:"http://localhost:3000/user/account/register/",
    type:"post",
    data:{
      username:'syqqq',
      password:"123",
      confirmedPassword:"123",
    },
   success(resp){
    console.log(resp);
   },

   error(resp){
    console.log(resp);
   }

  })



}
}

</script>

<style>
body{
  background-image: url("@/assets/images/background.png");
  background-size: cover;
}
</style>
