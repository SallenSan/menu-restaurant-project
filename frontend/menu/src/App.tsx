import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { FoodData } from './interface/FoodData';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();

  return (

    <div className='Container'>
      <h1>Menu</h1>
      <div className='card-grid'>
        {data?.map(foodData =>
          <Card
            price={foodData.price}
            title={foodData.title}
            image={foodData.image}
          />
        )}
      </div>

    </div>
  )

}

export default App
