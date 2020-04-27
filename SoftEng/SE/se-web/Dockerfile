FROM node:latest

RUN mkdir -p /se-web /home/nodejs && \
    groupadd -r nodejs && \
    useradd -r -g nodejs -d /home/nodejs -s /sbin/nologin nodejs && \
    chown -R nodejs:nodejs /home/nodejs

WORKDIR /se-web
COPY package.json /se-web/
RUN npm install --unsafe-perm=true

EXPOSE 4200

COPY . /se-web
RUN chown -R nodejs:nodejs /se-web
USER nodejs

CMD npm start