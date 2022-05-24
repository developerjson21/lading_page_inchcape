import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header/Header'
import Carrusel from './components/Carrusel/Carrusel';
import Home from './components/Home/Home'
function App() {
  return (
    <div className="App">
      <Header />
      <Carrusel />
      <Home></Home>
    
    </div>
  );
}

export default App;
