<template>
  <div class="conteudo">
      <ul>
          <router-link class="routerlink" to="/">
            <li>
                <img src="./../assets/img/logo.png" width="60" alt="Logo Bankslife">
            </li>
          </router-link>
          <router-link class="routerlink" to="/">
            <li>Rua</li>
          </router-link>
          <router-link class="routerlink" to="/about">
            <li>Sobre</li>
          </router-link>
          <router-link class="routerlink" to="/categorias">
            <li>Categorias</li>
          </router-link>
          <router-link class="routerlink" to="/produtos">
            <li>Produtos</li>
          </router-link>
      </ul>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss" scoped>

.conteudo{
    justify-content: center;
    ul{
        display: flex;
        list-style: none;
        justify-content: space-between;
        justify-content: center;
        align-items: center;
        margin-right: 10%;
        li{
            width: 100px;
        }
    }
}
.routerlink{
    text-decoration: none;
}
.routerlink:hover{
    color: #42b983;
}

</style>