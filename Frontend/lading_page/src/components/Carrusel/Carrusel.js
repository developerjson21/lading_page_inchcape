import React, {useState} from "react";
import { Carousel } from 'react-bootstrap';
import './Carrusel.css'
import img1 from './picture5.webp';
import img2 from './picture4.webp';
import img3 from './picture6.webp';
import img4 from './picture2.webp';
import img5 from './picture7.jpg';
import img6 from './picture3.webp';
import img7 from './picture1.webp';
function Carrusel() {
    const [index, setIndex] = useState(0);
  
    const handleSelect = (selectedIndex, e) => {
      setIndex(selectedIndex);
    };
  return (
    <Carousel activeIndex={index} onSelect={handleSelect}>
      <Carousel.Item> 
        <img
          className="d-block w-100"
          src={img1}
          alt="First slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img2}
          alt="Second slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img3}
          alt="Third slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img4}
          alt="Four slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img5}
          alt="Five slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img6}
          alt="Six slide"
        />
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src={img7}
          alt="Seven slide"
        />
      </Carousel.Item>
    </Carousel>
  );
  }
  
  export default Carrusel;