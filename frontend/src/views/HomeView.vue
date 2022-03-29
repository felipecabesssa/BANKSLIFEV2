<template>
  <div class="home">
      <img src="./../assets/img/fundoChafariz.jpg" width="400" alt="fundoChafariz">
      <h1>Eventos</h1>

      <ul>
          <li>
              <img src="./../assets/img/logoCircuitoSmall.png" alt="logo circuito candango">
              <p>Próima etapa deck dias 09 e 10 de abril.</p>
          </li>
          <li>
              <img src="./../assets/img/logoCircuitoSmall.png" alt="logo circuito candango">
              <p>Próima etapa deck dias 09 e 10 de abril.</p>
          </li>
          <li>
              <img src="./../assets/img/logoCircuitoSmall.png" alt="logo circuito candango">
              <p>Próima etapa deck dias 09 e 10 de abril.</p>
          </li>
      </ul>
  </div>
</template>

<script>
export default {
  name: 'HomeView',
  components: {
  }
}
</script>

<style lang="scss" scoped>

.home{
    ul{
        li{
            display: flex;
            align-items: center;
        }
    }
}


</style>