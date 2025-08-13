Throttling :-
  It ensures that a function is called at most once within a specified time interval, regardless of how many times the event triggering it occurs. 
  This is particularly useful for performance optimization in scenarios where events fire frequently, such as: 

  function throttle(func, delay) {
  let lastTime = 0;
  return function(...args) {
    const now = Date.now();
    if (now - lastTime >= delay) {
      func.apply(this, args);
      lastTime = now;
    }
  };
}

// Example usage:
const throttledScrollHandler = throttle(() => {
  console.log('Scroll event handled!');
}, 200); // Execute at most once every 200ms

window.addEventListener('scroll', throttledScrollHandler);

Debouncing :-
   It ensures that a function is called only after a specified period of inactivity, effectively delaying its execution until a "burst" of events has settled.

Common use cases:
Input field handling:
Preventing a search API call or validation from firing on every keystroke, instead waiting until the user has paused typing.
Window resizing:
Executing layout adjustments only after the user has finished resizing the window, rather than during every pixel change.
Scrolling events:
Triggering actions (e.g., lazy loading content) only after the user has stopped scrolling for a moment.
  
How it works:
Delaying execution: When a debounced function is called, it initiates a timer.
Resetting the timer: If the debounced function is called again before the current timer expires, the existing timer is cleared, and a new timer is set. This effectively resets the delay.
Executing the function: The original function is only executed once the specified delay has passed without any further calls to the debounced function.

  function debounce(func, delay) {
  let timeout;
  return function(...args) {
    const context = this;
    clearTimeout(timeout); // Clear previous timer
    timeout = setTimeout(() => func.apply(context, args), delay); // Set new timer
  };
}
// Example usage:
function handleSearchInput(event) {
  console.log("Searching for:", event.target.value);
  // In a real application, this would trigger an API call or data processing
}
const debouncedSearch = debounce(handleSearchInput, 500); // Debounce with a 500ms delay
document.getElementById("myInput").addEventListener("keyup", debouncedSearch);
