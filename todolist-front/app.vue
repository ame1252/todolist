<script setup lang="ts">
type TodoItem = {
  id: number
  title: string
  body: string
  is_completed: boolean
}

const value = (itemId: number): TodoItem =>{
  return {id: itemId,
    title: "たいとる",
    body: "ぼでぃ",
    is_completed: false
  }
} 
const items = ref<TodoItem[]>([value(1), value(2), value(3)]);
</script>

<template>
  <div>
    <ul>
      <li v-for="item in items" :key="item.id">
        <p>{{ item.id }}</p>
        <p>{{ item.title }}</p>
        <p>{{ item.body }}</p>
        <p>{{ item.is_completed }}</p>
      </li>
    </ul>
  </div>
</template>
