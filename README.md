<?xml version="1.0" encoding="utf-8"?>
<svg xmlns="http://www.w3.org/2000/svg" width="240" height="48" viewBox="0 0 240 48" role="img" aria-label="Loader badge">
  <style>
    .bg { fill:#0b1220; rx:8; }
    .label { font: 600 14px/1 "Segoe UI", Roboto, Arial; fill:#cfe8ff; }
    .pill { fill:#081422; rx:6; }
    .dot { r:6; fill:#6fb3ff; }
    .d1 { animation: bounce 1s infinite ease-in-out; animation-delay: 0s; }
    .d2 { animation: bounce 1s infinite ease-in-out; animation-delay: 0.15s; }
    .d3 { animation: bounce 1s infinite ease-in-out; animation-delay: 0.3s; }
    @keyframes bounce {
      0% { transform: translateY(0); opacity: 0.6; }
      35% { transform: translateY(-10px); opacity: 1; }
      70% { transform: translateY(0); opacity: 0.8; }
      100% { transform: translateY(0); opacity: 0.6; }
    }
  </style>

  <rect class="bg" x="0" y="0" width="240" height="48" rx="8" />
  <rect class="pill" x="12" y="10" width="120" height="28" rx="6" />
  <text x="22" y="29" class="label">Building...</text>

  <g transform="translate(156,24)">
    <circle class="dot d1" cx="-14" cy="0" r="6"/>
    <circle class="dot d2" cx="0" cy="0" r="6"/>
    <circle class="dot d3" cx="14" cy="0" r="6"/>
  </g>
</svg>

