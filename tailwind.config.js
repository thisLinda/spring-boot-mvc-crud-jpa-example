/** @type {import('tailwindcss').Config} */
//const colors = require("tailwindcss/colors")

module.exports = {
  content: ["../src/main/resources/templates/**/*.html"],
  theme: {
    colors: {
        transparent: "transparent",
        current: "currentColor",
        "cape-cod": "#4E5454",
        "dove-gray": "#737373",
        "ash": "#C7C1B5",
        "satin-linen": "#E3DFD4",
        "spring-rain": "#ADC5B7",
        "conch": "#C0D4C9"
    },
    extend: {},
  },
  plugins: [],
}