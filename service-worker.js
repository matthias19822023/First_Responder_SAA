const CACHE = 'first-responder-saa-v3';
const ASSETS = [
  "./",
  "./index.html",
  "./manifest.webmanifest",
  "./icons/icon-192.png",
  "./icons/icon-512.png",
  "./pages/01.png",
  "./pages/02.png",
  "./pages/03.png",
  "./pages/04.png",
  "./pages/05.png",
  "./pages/06.png",
  "./pages/07.png",
  "./pages/08.png",
  "./pages/09.png",
  "./pages/10.png",
  "./pages/11.png",
  "./pages/12.png",
  "./pages/13.png",
  "./pages/14.png",
  "./pages/15.png",
  "./pages/16.png",
  "./pages/17.png",
  "./pages/18.png",
  "./pages/19.png",
  "./pages/20.png",
  "./pages/21.png",
  "./pages/22.png",
  "./pages/23.png",
  "./pages/24.png",
  "./pages/25.png",
  "./pages/26.png",
  "./pages/27.png",
  "./pages/28.png"
];
self.addEventListener('install', event => {
  event.waitUntil(caches.open(CACHE).then(cache => cache.addAll(ASSETS)).then(() => self.skipWaiting()));
});
self.addEventListener('activate', event => {
  event.waitUntil(caches.keys().then(keys => Promise.all(keys.filter(k => k !== CACHE).map(k => caches.delete(k)))).then(() => self.clients.claim()));
});
self.addEventListener('fetch', event => {
  if (event.request.method !== 'GET' || new URL(event.request.url).origin !== self.location.origin) return;
  event.respondWith(caches.match(event.request).then(hit => hit || fetch(event.request)));
});
