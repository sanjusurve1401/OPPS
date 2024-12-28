const snowflakesContainer = document.getElementById('snowflakes-container');

// Generate snowflakes
function createSnowflakes() {
  const snowflakeCount = 100;
  for (let i = 0; i < snowflakeCount; i++) {
    const snowflake = document.createElement('div');
    snowflake.classList.add('snowflake');
    
    // Set random size for the snowflake
    const size = Math.random() * 5 + 2; // Snowflake size between 2 and 7px
    snowflake.style.width = `${size}px`;
    snowflake.style.height = `${size}px`;

    // Set random horizontal position and fall speed
    snowflake.style.left = `${Math.random() * 100}vw`; // Random horizontal position
    snowflake.style.animationDuration = `${Math.random() * 3 + 3}s`; // Snowflake fall time between 3s and 6s
    snowflake.style.animationDelay = `${Math.random() * 5}s`; // Random delay before starting fall

    // Add the snowflake to the container
    snowflakesContainer.appendChild(snowflake);
  }
}

// Start snowfall
createSnowflakes();
