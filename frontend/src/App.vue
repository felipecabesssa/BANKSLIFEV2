<template>
  <nav>
    <Menu />
    <hr>
  </nav>
  <router-view/>
</template>

<script>

import Menu from './components/Menu.vue'

export default {
    components:{
        Menu
    }
} 

</script>

<style lang="scss">

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: yellow;
  background-color: #22272e;
  height: 960px;
}

nav {
  padding: 30px;

  hr{
      border-bottom: 2px solid yellow;
  }  
  a {
    font-weight: bold;
    color: yellow;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
